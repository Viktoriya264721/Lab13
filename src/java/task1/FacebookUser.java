import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.ToString;

@Data @ToString
public class FacebookUser {
    private String email;
    private String userCountry;
    private LocalDate userActiveTime;
    public LocalDateTime getLastActiveTime() {
        return null;
    }
}
