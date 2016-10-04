public class Bulb
{
    private String light;
    
    public Bulb();
    {
        light = "off";
    }
	public void setLights(String s)
	{	
	    light = s;
	}
	public String getLights() 
	{
		return light;
	}
	public String toString()
	{
		return "Bulb [light=" + light + "]";
	}
    
}