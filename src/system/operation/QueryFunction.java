package system.operation;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

import system.file.FileOperation;

public final class QueryFunction {
	public static int num = FileOperation.getStudentNum();
	private static String matchEnd = "-?1?";
	/*
	 * �����������в�ѯ
	 */
	public static void queryByName()
	{
		int count;
		String queryName;
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("������ѧ���������в�ѯ��");
			queryName = input.next();
			
			for (count = 0; count < num; count++) 
			{
				if(queryName.equals(FileOperation.student[count].getName()))
				{
					break;
				}
			}
			if(count != num)
			{
				System.out.println("�ҵ���ؼ�¼�����£�");
				System.out.println("*********************************************");
				System.out.println("\tѧ��\t����\t�Ա�\tѧԺ\t��Ŀһ\t��Ŀ��\t��Ŀ��\tƽ����");
				showOneStudentInfo(count);
				System.out.println("\n\n\n");
			}
			else
			{
				System.out.println("û���ҵ���ؼ�¼��\n\n\n");
			}

		}while(true);
	}
	
	/*
	 * ����ѧ�Ž��в�ѯ
	 */
	public static void queryById()
	{
		int count;
		String queryId;
		Scanner input = new Scanner(System.in);
		String matchNum = "-?[0-9]+";
		
		while(true)
		{			
			while(true)
			{
				System.out.println("������ѧ�Ž��в�ѯ��");
				queryId = input.nextLine();
				
				if(queryId.matches(matchNum))
				{
					break;				
				}
				else 
				{
					System.out.println("�����ʽ�������������룺\n");
				}
			}
			if(queryId.equals("-1"))
			{
				System.out.println("�˳���ģ��.........\n");
				break;
			}
			for (count = 0; count < num; count++) 
			{
				if(queryId.equals(FileOperation.student[count].getId()))
				{
					break;
				}
			}
			if(count != num)
			{
				System.out.println("�ҵ���ؼ�¼�����£�");
				System.out.println("*********************************************");
				System.out.println("\tѧ��\t����\t�Ա�\tѧԺ\t��Ŀһ\t��Ŀ��\t��Ŀ��\tƽ����");
				showOneStudentInfo(count);
				System.out.println("\n\n\n");
			}
			else
			{
				System.out.println("û���ҵ���ؼ�¼��\n\n\n");
			}

		}
	}
	/*
	 * ����ѧԺ���в�ѯ
	 */
	public static void  queryByAcademy()
	{
		int count;
		String queryAcademy;
		ArrayList<Integer> studentId = new ArrayList<Integer>();
		String matchString = "[A-G]";
		Scanner input = new Scanner(System.in);
		while(true)
		{
			while(true)
			{
				System.out.println("�ֱ��� A-G 7��ѧԺ��������ѧԺ���ƽ��в�ѯ��");
				queryAcademy = input.next();
				if(queryAcademy.matches(matchString)) break;
				else {
					if(queryAcademy.matches(matchEnd)) break;
					System.out.println("û�и�ѧԺ�����������룡");
				}
			};
			
			if(queryAcademy.equals("-1"))
			{
				System.out.println("�˳���ģ��..........\n");
				break;
			}
			
			for (count = 0; count < num; count++) 
			{
				if(queryAcademy.equals(FileOperation.student[count].getAcademy()))
				{
					studentId.add(new Integer(count));
				}
			}
			if(studentId.isEmpty())
			{
				System.out.println("û���ҵ���ؼ�¼��\n\n\n");
			}
			else
			{
				System.out.println("�ҵ���ؼ�¼�����£�");
				System.out.println("*********************************************");
				System.out.println("\tѧ��\t����\t�Ա�\tѧԺ\t��Ŀһ\t��Ŀ��\t��Ŀ��\tƽ����");
				for(int i = 0; i < studentId.size(); i++)
				{
					showOneStudentInfo(studentId.get(i).intValue());
				}
				studentId.clear();
				System.out.println("\n\n\n");
			}
			
			
		}
	}
	
	public static void showOneStudentInfo(int num)
	{
		System.out.println("\t" +
				FileOperation.student[num].getId() 		+ "\t" +
				FileOperation.student[num].getName()  	+ "\t" +
				FileOperation.student[num].getSex() 		+ "\t" +
				FileOperation.student[num].getAcademy() 	+ "\t" +
				FileOperation.student[num].getScore1() 	+ "\t" +
				FileOperation.student[num].getScore2()	+ "\t" +
				FileOperation.student[num].getScore3() 	+ "\t" +
				FileOperation.student[num].getScoreAverage() 
							);
		
	}
	public static void showAllStudentInfo()
	{
		for (int i = 0; i < FileOperation.getStudentNum(); i++) {
			showOneStudentInfo(i);
		}
	}

}
