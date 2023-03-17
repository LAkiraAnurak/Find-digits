package pack1;

import java.io.*;
import java.util.stream.*;

class FDResult {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) 
    {
    // Write your code here
        int temp=n,c=0;
        for(;temp>0;temp/=10)
        {
            int r=temp%10;
            if(r==0) continue;
            if((n%r)==0) c++;
        }
        return c;
        /*
        int temp=n,c=0;
        while(temp>0)
        {
            int r=temp%10;
            if(r==0) continue;
            if(n%r==0) c++;
            temp/=10;
        }
        return c;
        */
    }

}

public class FindDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = FDResult.findDigits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}