class DataShadowing
{
  int x=10;
  void show( int x)
  {
    System.out.println(x);
	System.out.println(x);
  }
  public static void main(String ...s)
  {
    DataShadowing d=new DataShadowing();
	d.show(20);
  }
}