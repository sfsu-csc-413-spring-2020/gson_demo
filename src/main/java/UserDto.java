import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserDto {
  public final String username;
  public final String userid;
  public final String myKey;

  public UserDto(String username, String userid, String myKey) {
    this.username = username;
    this.userid = userid;
    this.myKey = myKey;
  }
}