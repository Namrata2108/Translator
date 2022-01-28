package edu.neu.csye6200;

import java.io.IOException;

public class Driver {
	public static void main(String[] args) throws IOException 
	{
		System.out.println(Driver.class.getName() + " Started");
        Demo.show(); 
        System.out.println(Driver.class.getName() + " Execution Finished");

        //new Demo(Language.ENGLISH,Language.FRENCH, "hello, how are you?");

	}
}
/**
 * 
			 * edu.neu.csye6200.Driver Started
*------------------------------*
				 Original Text for translation
			Do you have bread?
			Yes, we have no bread today!
			Thank you!
			You are welcome!
			*------------------------------*
				 Translation from English to French
			faire tu ont bread?
			yes, nous ont non pain today!
			remercier you!
			tu sommes welcome!
			*------------------------------*
				 Translation from English to Spanish
			hacer usted tengo bread?
			yes, nosotros tengo no pan-de-molde today!
			gracias you!
			usted están welcome!
			*------------------------------*
				 Translation from French to Spanish
			hacer usted tengo bread?
			yes, nosotros tengo no pan-de-molde today!
			gracias you!
			usted están welcome!
			*------------------------------*
				 Translation from French to English
			do you have bread?
			yes, we have no bread today!
			thank you!
			you are welcome!
			*------------------------------*
				 Translation from Spanish to English
			do you have bread?
			yes, we have no bread today!
			thank you!
			you are welcome!
			*------------------------------*
				 Translation from Spanish to French
			faire tu ont bread?
			yes, nous ont ne pas pain today!
			remercier you!
			tu sommes welcome!
			*------------------------------*
			edu.neu.csye6200.Driver Execution Finished
*/
