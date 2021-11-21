package com.company;

import java.util.*;

class Main
{
    public static void main(String[] args)
    {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    ArrayList<Integer> count = new ArrayList<Integer>();
	    ArrayList<Integer> answer = new ArrayList<Integer>();

	    for (int i=0;i<n;i++)
        {
            int temp = input.nextInt();
            if(list.contains(temp))
            {
                int p = list.indexOf(temp);
                count.set(p,count.get(p)+1);
            }
            else
            {
                list.add(temp);
                count.add(1);
            }
        }

        int max = Collections.max(count);

        for(int i=0;i<list.size();i++)
        {
            if(count.get(i) == max)
            {
                answer.add(list.get(i));
            }
        }

        Collections.sort(answer);

        for (Integer i:answer)
        {
            System.out.print(i + " ");
        }
    }
}
