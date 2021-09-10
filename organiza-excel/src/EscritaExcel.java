import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class EscritaExcel {

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {

		// CAMINHO DO ARQUIVO
		File file = new File("C:/diretorio/escritaOrganizada.xls");
		if (!file.exists()) {
			file.createNewFile();
			System.out.println("Arquivo criado!");
		}

		// ESCRITA NO EXCEL - COLUNA X LINHA
		WritableWorkbook wworkbook = null;
		wworkbook = Workbook.createWorkbook(file);

		WritableSheet wsheet1 = wworkbook.createSheet("Primeira Sheet", 0);

		for (int colms = 0; colms < 10; colms++) {
			for (int rows = 0; rows < 10; rows++) {
				wsheet1.addCell(new Label(colms, rows, "Conteúdo " + (rows + 1) + " Coluna " + (colms + 1)));
			}
		}
		wworkbook.write();
		wworkbook.close();

	}

}
