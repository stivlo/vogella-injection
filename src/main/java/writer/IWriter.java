package writer;

public interface IWriter {

        /**
         * I took the liberty to rename this method from writer to write, because writer.write() makes
         * makes more sense that writer.writer()
         * 
         * @param s
         */
        void write(String s);

}
