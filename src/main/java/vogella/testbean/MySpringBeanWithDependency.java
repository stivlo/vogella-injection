package vogella.testbean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vogella.writer.IWriter;

@Service
public class MySpringBeanWithDependency {
        
        private IWriter writer;

        @Autowired
        public MySpringBeanWithDependency(IWriter writer) {
                this.writer = writer;
        }
        
        public void run() {
                String s = "This is my test";
                writer.write(s);
        }

}
