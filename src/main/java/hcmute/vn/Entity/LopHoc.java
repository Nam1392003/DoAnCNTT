package hcmute.vn.Entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LopHoc implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int MaLopHoc;
	private String MonHoc;
	private String HocPhi;
	private String BuoiHoc;
	@ManyToOne
	@JoinColumn(name ="maPhuHuynh")
	private PhuHuynh phuHuynh;
	private String YeuCau;
	@ManyToOne
	@JoinColumn(name ="maGiaSu")
	private GiaSu GiaSu;
	private int TrangThai;
}
