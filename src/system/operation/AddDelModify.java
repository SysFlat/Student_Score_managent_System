package system.operation;

import java.util.Scanner;

import system.file.FileOperation;

public final class AddDelModify {
	
	public static void addStudent()
	{
		String id;
		String name;
		String sex;
		String academy;
		float score1;
		float score2;
		float score3;
		System.out.println("���ѧ����\n\n\n������ѧ����Ϣ:\n\n");
		
		
		
	}
	
	public static void delStudent()
	{
		String id,out;
		String match = "[0-9]+";
		Scanner input = new Scanner(System.in);
		System.out.println("ɾ��ѧ���� \n\n\n");
		while(true)
		{
			System.out.println("�������ɾ����ѧ��ѧ�ţ�\n\n");
			while(true)
			{
				id = input.nextLine();
				if(id.matches(match)) break;
				else System.out.println("�����ʽ�������������룡");
			}
			
			for(int i = 0; i < FileOperation.getStudentNum(); i++)
			{
				if(id.equals(FileOperation.getStudent(i).getId()))
				{
					FileOperation.studentArray.remove(i);
					FileOperation.isModify = true;
				}
			}
			
			if (!FileOperation.isModify)
				System.out.println("û�������Ϣ��");
			System.out.println("�˳�����Y/N��");
			
			out = input.nextLine();
			
			if(out.equals("Y") || out.equals("y")) 
			{
				System.out.println("�˳�ɾ��ҳ��.........\n\n\n");
				//input.close();
				break;
			}
		}
		
		
	}
	
	public static void modifyStudent()
	{
		System.out.println("�޸�ѧ����Ϣ��\n\n\n");
		
	}
}
