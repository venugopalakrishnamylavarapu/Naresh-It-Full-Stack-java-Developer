package com.prac;

import java.util.Arrays;
import java.util.Scanner;

public class Prac {
	public static int finAvgVoyagesByPct(NavalVessel[] nv,int percentage) {
		int totalnovc=0;
		int count=0;
		NavalVessel[] filter=new NavalVessel[0];
		for(int i=0;i<nv.length;i++)
		{
			totalnovc+=nv[i].getNoOfVoyagesCompleted();
			int perc=(nv[i].getNoOfVoyagesCompleted()*100/nv[i].getNoOfVoyagesPlanned());
			if(perc>=percentage)
			{
				filter=Arrays.copyOf(filter, filter.length+1);
				filter[filter.length-1]=nv[i];
				count++;
			}
		}
		if(count>0)
			return totalnovc/count;
		return 0;
	}
	public static NavalVessel findVesselByGrade(String purpose,NavalVessel[] nv1) {
		for(int i=0;i<nv1.length;i++)
		{	
			if(nv1[i].getPurpose().equalsIgnoreCase(purpose))
			{
				int perc=(nv1[i].getNoOfVoyagesCompleted()*100/nv1[i].getNoOfVoyagesPlanned());
				if(perc==100)	nv1[i].setClassification("Start");
				else if (perc >= 80 && perc <= 99) nv1[i].setClassification("Leader");
				else if (perc >= 55 && perc <= 79) nv1[i].setClassification("Inspirer");
				else
					nv1[i].setClassification("Striver");
				return nv1[i];
			}
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NavalVessel[] arr=new NavalVessel[4];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=new NavalVessel(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextInt(),sc.next());
			sc.nextLine();
		}
		int perc1=sc.nextInt();sc.nextLine();
		String purp1=sc.nextLine();
		
		int aovc =finAvgVoyagesByPct(arr,perc1);
		if(aovc>0)
			System.out.println(aovc );
		else
			System.out.println("There are no voyages completed with this percentage");
		
		NavalVessel obj1=findVesselByGrade(purp1,arr);
		if(obj1==null)
			System.out.println("No Naval Vessel is availablr with the specified purpose");
		else
			System.out.println(obj1.getVesselName()+"%"+obj1.getClassification());
	}
	
}
