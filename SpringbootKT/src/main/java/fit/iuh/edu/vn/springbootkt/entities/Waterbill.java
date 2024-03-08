package fit.iuh.edu.vn.springbootkt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="water_bill")
public class Waterbill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String billID;
    @Column(name = "meter_reading")
    private double meterReading;
    @Column( name = "toltal_amount")
    private double totalAmount;

    public Waterbill(int i, String s) {
    }
}
