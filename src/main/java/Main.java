import com.google.gson.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

  public static void main(String[] args) throws IOException {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    byte[] encoded = Files.readAllBytes(Paths.get("src/data.json"));
    String fileData = new String(encoded, Charset.defaultCharset());
    UserDtoList userDtos = gson.fromJson(fileData, UserDtoList.class);
    for(UserDto userDto: userDtos.users){
      System.out.println(gson.toJson(userDto));
    }
  }
}