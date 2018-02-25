package Mypack;

public class Classstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="iopio";
		int y=x.length(); 
		;
		int flag=0;
		
		for(int i=1;i<=y-1;i++)
		{	char ip=x.charAt(i);
		
			for(int j=0;j<=i-1;j++)
			{
			
			
				char  pa=x.charAt(j);
				
			
				if(ip==pa){
					
					flag=flag+1;
					if(flag==1)
					{

						System.out.print(pa);	
						
					}
					
					
					
				
					
				}
				
				
				
				
			}
			
		}
		

		}

	}


