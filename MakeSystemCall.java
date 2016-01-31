import java.io.*;

class MakeSystemCall {

    public static void main(String args[]) {
        try {
            Process runEcho = null;
            runEcho = Runtime.getRuntime().exec("uname");
            runEcho.waitFor();
            BufferedReader br = new BufferedReader(new InputStreamReader(runEcho.getInputStream()));

            String line = "";
            while((line = br.readLine()) != null){
                System.out.println("Your OS: "+line);
            }

            br.close();
        }
        catch(Exception e){
            System.out.println("Exception!!!");
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
