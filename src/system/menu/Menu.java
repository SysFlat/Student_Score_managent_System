package system.menu;

import java.util.Scanner;

import system.file.FileOperation;
import system.operation.QueryFunction;
import system.operation.SortFunction;
import system.operation.Statistic;

public class Menu {

	public static void main(String[] args) {
		
		mainMenu();
	}
	
	public static void mainMenu(){
		Scanner input = new Scanner(System.in);
		/*
		 * ϵͳ������
		 */
		while(true)
		{
			System.out.println("****************************************");
			System.out.println("\t��ӭʹ�ò�ѯϵͳ\n\n");
			System.out.println("\t1:����ƽ���ɼ��Ľ�������");
			System.out.println("\t2:������������������");
			System.out.println("\t3:����ѧ�Ž��в�ѯ");
			System.out.println("\t4:�����������в�ѯ");
			System.out.println("\t5:����ѧԺ���в�ѯ");
			System.out.println("\t6:ƽ���ɼ�ͳ��");
			System.out.println("\t7:�˳�");
			System.out.println("****************************************");
			System.out.println("�������ѡ����Ӧ�Ĺ��ܣ�");
			
			FileOperation.readFile();
			int choice = input.nextInt();
			//Integer.parseInt(s)
			switch(choice)
			{
				case 1: SortFunction.descendByAverage();	
				break;
				
				case 2: SortFunction.ascendByName();	
				break;
				
				case 3: QueryFunction.queryById();
				break;
				
				case 4: QueryFunction.queryByName();//
				break;
				
				case 5: QueryFunction.queryByAcademy();
				break;
				
				case 6: Statistic.statisticScore();
				break;
				
				case 7: exit();break;
			}
		}

	}
	public static void exit()
	{
		System.out.println("�˳�ϵͳ.........");
		System.exit(0);
	}
	
}
