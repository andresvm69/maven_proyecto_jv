package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//byte
		byte datoByte=2;		 //primitivo
		Byte datoByteWrapper=3; //Wrapper
		System.out.println("primitivo: " + datoByte); 
		System.out.println("Wrapper: "+datoByteWrapper); 
		//conversiones
		byte datoByte1=6;	
		Byte datoConvertido= datoByte1;
		System.out.println("Byte convertido: "+datoConvertido);
		//Conversiones 2
		Byte datoConvertido2 = 6;
		byte datoByte2 = datoConvertido2.byteValue();
		System.out.println("byte convertido:"+ datoByte2); 


		
		//short
		short datoShort=1;  		 //primitivo
		Short datoShortWrapper=1;  //Wrapper
		System.out.println("primitivo: "+datoShort);
		System.out.println("Wrapper: "+datoShortWrapper); 
		//conversiones
		short datoShort1 =4;
		short shortConvertido=datoShort1;
		System.out.println("Short convertido: "+ shortConvertido); 
		//conversiones 2
		Short shortConvertido2 = 5;
		short datoShort2 = shortConvertido2.shortValue();
		System.out.println("short convertido:"+ datoShort2); 

		
		//int
		int edad=45;  //primitivo
		Integer edadWrapper=48; //Wrapper
		System.out.println("primitivo: "+edad);
		System.out.println("Wrapper: "+edadWrapper);
		//Conversiones
		int edad1 = 45;
		Integer integerConvertido=edad1;
		System.out.println("Integer convertido: "+ integerConvertido);
		//conversiones 2
		Integer integerConvertido2 = 23;
		int edad2= integerConvertido2.intValue();
		System.out.println("int convertido:"+edad2); 


		
		
		//long
		long valorGrande=12344L;   //primitivo
		Long valorGrandeWrapper=1212231L;   //Wrapper
		System.out.println("primitivo: "+valorGrande);
		System.out.println("Wrapper: "+valorGrandeWrapper); 
		//Conversiones
		long valorGrande1 = 454514212L;
		Long longConvertido=12345456L;
		System.out.println("Long convertido: "+ longConvertido);
		//conversiones 2
		Long longConvertido2 = 545415645L;
		long valorGrande2 = longConvertido2.longValue();
		System.out.println("long convertido:"+ valorGrande2); 


		
		//boolean
		boolean datoBoolean =true;     //primitivo
		Boolean datoBoleanWrapper=false;          //Wrapper
		System.out.println("primitivo: "+ datoBoolean);
		System.out.println("Wrapper: "+datoBoleanWrapper ); 
		//Conversiones
		boolean datoBoolean1 =true;
		Boolean booleanConvertido= false;
		System.out.println("Boolean convertido: "+ booleanConvertido);
		//conversiones 2
		Boolean booleanConvertido2 = true;
		boolean datoBoolean2 = booleanConvertido2.booleanValue();
		System.out.println("boolean convertido:"+ datoBoolean2); 

		
		//float
		float datoFloat= 35f;           //primitivo
		Float datoFloatWrapper= 35f ;             //Wrapper
		System.out.println("primitivo: "+ datoFloat);
		System.out.println("Wrapper: "+datoFloatWrapper);
		//Conversiones
		float datoFloat1 = 45f;
		Float floatConvertido=12f;
		System.out.println("Float convertido: "+ floatConvertido);
		//conversiones 2
		Float floatConvertido2 = 54f;
		float datoFloat2 = floatConvertido2.floatValue();
		System.out.println("float convertido:"+ datoFloat2); 

		
		//double
		double datoDouble=10.90 ;               //primitivo
		Double datoDoubleWrapper= 10.90;                //Wrapper
		System.out.println("primitivo: "+ datoDouble);
		System.out.println("Wrapper: "+datoDoubleWrapper);
		//Conversiones
		double datoDouble1 = 44.5;
		Double doubleConvertido=12.3;
		System.out.println("Double convertido: "+ doubleConvertido);
		//conversiones 2
		Double doubleConvertido2 = 5.45;
		double datoDouble2 = doubleConvertido2.doubleValue();
		System.out.println("double convertido:"+ datoDouble2); 

		
		//char
		char datoChar= 'A' ;                   //primitivo
		Character datoCharacterWrapper= 'b' ;         //Wrapper
		System.out.println("primitivo: "+ datoChar);
		System.out.println("Wrapper: "+ datoCharacterWrapper );
		//Conversiones
		char datoChar1 = 'X';
		Character charConvertido='Z';
		System.out.println("Character convertido: "+ charConvertido);
		//conversiones 2
		Character charConvertido2 = 'Q';
		char datoChar2 = charConvertido2.charValue();
		System.out.println("char convertido:"+ datoChar2); 

		
		
		
		
		
		
		
		
	}

}
