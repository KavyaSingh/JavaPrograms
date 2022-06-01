import java.util.function.Supplier;

public class UsingSupplierToGenerateOTP {

    public static void main(String arg[])
    {
        Supplier<Long> suppObj = () -> {

            String number="";
            Long otp = 0l;
            for(int i=0;i<6;i++)
            {
                number=number+(int)(Math.random()*30);
            }
            if(number!=null)
            {
                otp=Long.parseLong(number);
            }
            return otp;
        };

        System.out.println("OTP is : "+suppObj.get());
    }
}
