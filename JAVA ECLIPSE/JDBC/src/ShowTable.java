import java.sql.*;


public class ShowTable
{


public static void main(String[] args)
{
	try
	{
		Class.forName("org.h2.Driver");
		System.out.println("Server Successfully Loaded");
		Connection conne=DriverManager.getConnection("jdbc:h2:~/test","sa","safna123");
		Statement stmt=conne.createStatement();
		ResultSet rs=stmt.executeQuery("select*from STUDENT");
		
		
		ResultSetMetaData rsmd=rs.getMetaData();
		int cc=rsmd.getColumnCount();
		for(int i=1;i<cc;i++)
		{
			System.out.print(rsmd.getColumnName(i)+" ");
		}
		System.out.println();
		
		
		
		while(rs.next())
		{
			for(int j=1;j<=cc;j++)
			{
				System.out.print(rs.getString(j)+" ");
			}
			System.out.println();
			
			//System.out.println(rs.getInt(1)+" ");
			//System.out.println(rs.getString(2)+" ");
			//System.out.println(rs.getInt(3)+" ");
			//System.out.println(rs.getString(4)+" ");
	    }
		stmt.close();
		conne.close();
	}
		
	catch (Exception e) 
	{
		System.out.println("Exception Arised:"+e);
	}
}
}