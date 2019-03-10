import java.util.*;
class Employee
{
	String empid,name,dept,date;
	int basic,hra,it;
	char desigCode;
	Employee(String empid, String name, String date, char c, String dept, int basic, int hra, int it)
	{
		this.empid = empid;
		this.name=name;
		this.date = date;
		this.desigCode = c;
		this.dept=dept;
		this.basic = basic;
		this.hra = hra;
		this.it= it;
	}
	public static void main(String []ags)
	{
		int da=0,sal=0;
   		Scanner sc = new Scanner(System.in);
		Employee emp[] = new Employee[4];
		emp[0]=new Employee("1001","Ashish","01/04/2009",'e',"R&D",20000,8000,3000);
		emp[1]=new Employee("1002","Sushma","23/08/2012",'c',"PM",30000,12000,9000);
		emp[2]=new Employee("1003","Rahul","12/11/2008",'k',"Acct",10000,8000,1000);
		emp[3]=new Employee("1004","Chahat","29/01/2013",'r',"Front Desk",12000,6000,2000);
		
		System.out.println("Enter employee id : ");
		String s = sc.next();
		for(int i=0 ; i<emp.length;i++)
		{
			if(emp[i].empid.equals(s))
			{
				//System.out.println(emp[i].name);
				switch(emp[i].desigCode)
				{
					case 'e':
						da=20000;
						sal = emp[i].basic + emp[i].hra + emp[i].it + da ;
						System.out.println(" "+emp[i].empid+ "\t" +emp[i].name+"\t"+emp[i].dept+"\t"+emp[i].desigCode+"\t"+sal);
						break;
					case 'c':
						da=32000;
						sal = emp[i].basic + emp[i].hra + emp[i].it + da ;
						System.out.println(" "+emp[i].empid+ "\t" +emp[i].name+"\t"+emp[i].dept+"\t"+emp[i].desigCode+"\t"+sal);
						break;
					case 'k':
						da=12000;
						sal = emp[i].basic + emp[i].hra + emp[i].it + da ;
						System.out.println(" "+emp[i].empid+ "\t" +emp[i].name+"\t"+emp[i].dept+"\t"+emp[i].desigCode+"\t"+sal);
						break;
					case 'r':
						da=15000;
						sal = emp[i].basic + emp[i].hra + emp[i].it + da ;
						System.out.println(" "+emp[i].empid+ "\t" +emp[i].name+"\t"+emp[i].dept+"\t"+emp[i].desigCode+"\t"+sal);
						break;
				}
			}
		}
	}
}