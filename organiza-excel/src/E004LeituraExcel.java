/*
 Este método lê a sheet, linha por linha e coluna por coluna e persiste os dados da leitura em banco. 
 Após a persistência dos dados, é possível editar ou excluir as informações inconsistentes
 */
import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;

public class E004LeituraExcel {
	public static void main(String[] args) throws BiffException, IOException, WriteException {

		// CAMINHO DO ARQUIVO
		File file = new File("C:/diretorio/leituraOrganizada.xls");

		// LEITURA DO EXCEL
		Workbook workbook = Workbook.getWorkbook(file);
		Sheet sh = workbook.getSheet(0);
		for (int colm = 0; colm < sh.getColumns(); colm++) {
			for (int rows = 0; rows < sh.getRows(); rows++) {
				if (sh.getCell(colm, rows).getContents() == "") {
					System.out.print("NULL" + "\n");
				} else {
					System.out.print(sh.getCell(colm, rows).getContents() + "\n");
				}
			}
		}
	}
}