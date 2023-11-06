package com.appium.mobile;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String OUTPUT_DIRECTORY = System.getenv("OUTPUT_DIRECTORY") != null
            ? "/" + System.getenv("OUTPUT_DIRECTORY") + "/" : "/target/";
    public static void main( String[] args )
    {
        //System.out.println( System.getProperty("user.dir") );
        //System.out.println( System.getProperty("user.home") );
        System.out.println( System.getProperty("project.build.directory") );
        
        //System.out.println( "/" + System.getenv("OUTPUT_DIRECTORY") + "/" );
    }
}
