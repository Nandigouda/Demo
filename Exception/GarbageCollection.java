class GarbageCollection 
{
	public void finalize()		
	{
		System.out.println("Remove th object");
	}
	public static void main(String[] args) 
	{
		GarbageCollection obj=new GarbageCollection();
		obj=new GarbageCollection();
		obj=new GarbageCollection();
		obj=new GarbageCollection();
		obj=new GarbageCollection();
		System.out.println(obj);
		System.gc();

	}
	

}
