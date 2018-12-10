import java.io.*;

class FileWork{

    private String FILENAME_IN ;
    private final String ENCODING_WIN1251 = "windows-1251";
    private String FILENAME_OUT ;

    public FileWork(String N_In, String N_Out){
        this.FILENAME_IN = N_In;
        this.FILENAME_OUT = N_Out;
    }

    public void ModifyFile(String SubStrIn, String SubStrOut) throws FileNotFoundException {

        try {
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(FILENAME_IN),ENCODING_WIN1251));
            FileWriter fw = new FileWriter(new File(FILENAME_OUT));

            String tmp = null;
            String ost = null;
            int len = SubStrIn.length();
            while ((tmp = br.readLine()) != null) {
                int i = tmp.indexOf(SubStrIn);
                if (i != -1) {
                    ost = tmp;
                    while(i!= -1){

                        fw.write(ost.substring(0, i));
                        fw.write(SubStrOut);
                        ost = ost.substring(i + len);
                        i = ost.indexOf(SubStrIn);
                        if(i == -1) fw.write(ost+"\r\n");
                    }
                } else {
                    fw.write(tmp + "\r\n");
                }
            }
            br.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

