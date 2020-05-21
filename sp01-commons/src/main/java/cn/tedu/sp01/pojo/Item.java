package cn.tedu.sp01.pojo;
//*****-***************....
//客户端二加注释提交
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	private Integer id;
	private String name;
	private Integer number;
}
