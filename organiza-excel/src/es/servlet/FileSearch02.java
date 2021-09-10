package es.servlet;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileSearch02 {

	private String fileNameToSearch;
	private String encontrado;
	private String encontradoSub;
	private static String matchString = "escritaOrganizada.xls";

	// Informar o diretório para busca
	private static String diretorioBuscado = "C:/(WorkSpace-FRONT)/";

	// Informar extensão do arquivo procurado
	private static String extensaoArquivo = "ts";

	// Quantidade de arquivos encontrados para extensão especificada
	static List<String> comprimento = new ArrayList<>();

	private List<String> result = new ArrayList<String>();

	public String getFileNameToSearch() {
		return fileNameToSearch;
	}

	public void setFileNameToSearch(String fileNameToSearch) {
		this.fileNameToSearch = fileNameToSearch;
	}

	public List<String> getResult() {
		return result;
	}

	public static void main(String[] args) throws IOException {

		FileSearch02 fileSearch = new FileSearch02();

		fileSearch.searchDirectory(new File(diretorioBuscado), matchString);

		System.out.println("Total encontrado: " + comprimento.size());

	}

	public void searchDirectory(File directory, String fileNameToSearch) throws IOException {

		setFileNameToSearch(fileNameToSearch);

		if (directory.isDirectory()) {
			search(directory);
		} else {
			System.out.println(directory.getAbsoluteFile() + " is not a directory!");
		}
	}

	private void search(File file) throws IOException {

		if (file.isDirectory()) {

			encontrado = file.getAbsoluteFile().toString().replaceAll("\\\\", "/");

			File fileSub = new File(encontrado);

			File[] files = fileSub.listFiles(new FilenameFilter() {

				@Override
				public boolean accept(File dir, String name) {
					if (name.toLowerCase().endsWith(extensaoArquivo)) {

						return true;
					} else {
						return false;
					}
				}
			});
			for (File f : files) {

				System.out.println((comprimento.size()+1) + ") " + encontrado + "/" + f.getName());
				comprimento.add(f.getName());
			}

			if (file.canRead()) {
				for (File temp : file.listFiles()) {
					if (temp.isDirectory()) {

						search(temp);

					} else {

						if (getFileNameToSearch().equals(temp.getName().toLowerCase())) {

							encontradoSub = temp.getAbsoluteFile().toString();

							result.add(encontradoSub);

						}

					}

				}

			}

		}

	}
}
