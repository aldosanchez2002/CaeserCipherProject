package sample;

public class Caesar_Cipher {


    public static String caesar_encode(String text, int shifter)
    {
        String output = "";
        for(int i = 0; i < text.length(); i++)
        {
            if(text.charAt(i) >= 33 && text.charAt(i) <= 64){
                return "-1";
            }else if(text.charAt(i) >= 91 && text.charAt(i) <= 96){
                return "-1";
            }else if(text.charAt(i) ==' '){
                output = output.substring(0) + ' ';
            }else if(text.charAt(i)+shifter >= 122 ){
                output = output.substring(0) + (char) ((text.charAt(i)+shifter)-26);
            }else if(text.charAt(i) < 90 && text.charAt(i)+shifter >= 90){
                output = output.substring(0) + (char) ((text.charAt(i)+shifter)-26);
            }else{
                output = output.substring(0) + (char) ((text.charAt(i)+shifter));
            }
        }
        return output;
    }


    public static String caesar_decode(String text, int shifter)
    {
        String output = "";
        for(int i = 0; i < text.length(); i++)
        {
                if(text.charAt(i) >= 33 && text.charAt(i) <= 64){
                    return "Error: Special character detected";
                }else if(text.charAt(i) >= 91 && text.charAt(i) <= 96){
                    return "Error: Special character detected";
                }else if(text.charAt(i) ==' '){
                    output = output.substring(0) + ' ';
                }else if(text.charAt(i) > 65 && text.charAt(i)-shifter < 65){
                    output = output.substring(0) + (char) ((text.charAt(i)-shifter)+26);
                }else if(text.charAt(i)-shifter < 97 ){
                    output = output.substring(0) + (char) ((text.charAt(i)-shifter)+26);
                }else{
                    output = output.substring(0) + (char) ((text.charAt(i)-shifter));
                }
            }
            return output;
    }

}