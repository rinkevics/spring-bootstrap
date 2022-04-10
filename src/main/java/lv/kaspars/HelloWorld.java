package lv.kaspars;

import org.springframework.stereotype.Service;

@Service
public class HelloWorld {
   private String message;

   public HelloWorld(String message) {
      this.message = message;
   }

   public String getMessage() {
      return message;
   }
}