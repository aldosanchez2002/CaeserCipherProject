package sample;
/*
    By: Julio Nuila
 */

public class Caesar_Cipher {

    public static String caesar_encode(String text, int shifter)
    {
        String output = "";
        int encode_char;
        for(int i = 0; i < text.length(); i++) {
           if ((Character.toUpperCase(text.charAt(i)) == text.charAt(i)))
            {
                encode_char = text.charAt(i)+(shifter % 26);
                if (encode_char > 90){
                    output = output.substring(0) + ((char) ((encode_char%90)+64));
                }else{
                    output = output.substring(0) + ((char) encode_char);
                }
            }else{
               encode_char = text.charAt(i)+(shifter % 26);
               if (encode_char > 122){
                   output = output.substring(0) + ((char) ((encode_char%122)+96));
               }else{
                   output = output.substring(0) + ((char) encode_char);
               }
            }
        }
        return output;
    }

    public static String caesar_decode(String text, int shifter)
    {
        int decode_char;
        String output = "";
        for(int i = 0; i < text.length(); i++)
        {
            if ((Character.toUpperCase(text.charAt(i)) == text.charAt(i)))
            {
                decode_char = text.charAt(i)-(shifter % 26);

                if (decode_char < 65){
                    output = output.substring(0) + ((char) (91-(65%decode_char)));
                }else{
                    output = output.substring(0) + ((char) decode_char);
                }

            }else{
                decode_char = text.charAt(i)-(shifter % 26);
                if (decode_char < 122){
                    output = output.substring(0) + ((char) (123-(97%decode_char)));
                }else{
                    output = output.substring(0) + ((char) decode_char);
                }
            }
        }
        return output;
    }

}