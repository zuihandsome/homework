/*
 * ���⣺ ����n������������Ϊ��������ɵ�����a[1],a[2],a[3],��,a[n],���������a[i]+a[i+1]+��+a[j]���Ӷκ͵����ֵ��
 * ��������������Ϊ����ʱ�����Ӷκ�Ϊ0�����˶��壬���������ֵΪ�� Max{0,a[i]+a[i+1]+��+a[j]},1<=i<=j<=n��
 * ���磬����a[1],a[2],a[3],a[4],a[5],a[6]��=(-2,11,-4,13,-5,-2)ʱ������Ӷκ�Ϊ20��
 */
package com.Text;

import java.util.*;

public class ErrorText {

    public static void main(String[] args) {
        Maxjisuan max=new Maxjisuan();
        Scanner s=new Scanner(System.in);
        int[] a1=new int[6];
        System.out.println("���룺");
        int i=0;
        while(i<6)
        {
        	String str=s.next();
        	int a=Integer.parseInt(str);
        	a1[i]=a;
        	i++;
        }
        s.close();
        System.out.println("Max:"+max.getMax(a1));
    }
}
class Maxjisuan
{
	int max;
	public int getMax(int[] a)
	{
		max=(int)a[0];
		int temp;
		for(int i=0;i<a.length;i++)
		{
			temp=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(max>temp+a[j])
				{
					temp=temp+a[j];
				}
				else
				{
					if(max<temp+a[j])
					{
						if(temp+a[j]>a[j])
						{
							max=temp+a[j];
							temp=temp+a[j];
						}
						else
						{
							max=a[j];
							temp=temp+a[j];
						}
					}
					
				}
				System.out.print(max+" ");
			}
		}
		System.out.println();
		if(max<0)
		{
			return 0;
		}
		else
		{
		   return max;
		}
	}
}