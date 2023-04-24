import java.io.*;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        
        Stack<Integer> s = new Stack<>();

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] aa = br.readLine().split(" ");

            switch (aa[0]) {
                case "push":
                    s.push(Integer.parseInt(aa[1]));
                    break;
                
                case "pop":
                    if (s.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(s.pop() + "\n");
                    }
                    break;
                
                case "size":
                    bw.write(s.size() + "\n");
                    break;
                
                case "empty":
                    if (s.empty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                
                case "top":
                    if (s.empty()) {
                        bw.write("-1" + "\n");
                    } else {
                        bw.write(s.peek() + "\n");
                    }
                    break;
            }

        }
        bw.flush();
        bw.close();
    }
}
