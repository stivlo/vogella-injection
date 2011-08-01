package vogella.writer;


public class NiceWriter implements IWriter {

        @Override
        public void write(String s) {
                System.out.println("The string is: '" + s + "'");
        }

}
