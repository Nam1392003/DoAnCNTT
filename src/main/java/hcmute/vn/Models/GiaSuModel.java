package hcmute.vn.Models;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GiaSuModel {

	private int MaGiaSu;
	private String TenGiaSu;
	private Date NgaySinh;
	private String DiaChi;
	private String SDT;
	private String NgheNghiep;
	private String MonHoc;
}
