package group.studentmanager.model.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {


    private String title;
    private double price;
    private String description;
    private String category;
    private String image;


}
