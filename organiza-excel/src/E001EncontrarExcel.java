/*
 Este método pretende varrer um caminho especificado pelo usuário, encontrando os arquivos de interesse em diretórios e subdiretórios. 
 A extensão do arquivo é especificada em um menu de seleção.
 Em um primeiro momento, apenas uma extensão de arquivo será permitida para selecionar.  
 */

import java.io.File;
import java.io.FilenameFilter;

public class E001EncontrarExcel {

	public static void main(String[] args) {

		String nomeDiretorio = "C:/";
		File file = new File(nomeDiretorio);

		File[] files = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.toLowerCase().endsWith(".pdf")) {
					return true;
				} else {
					return false;
				}
			}
		});
		for (File f : files) {
			System.out.println(nomeDiretorio + f.getName());
		}
		
		
		
		
		
		/*
		
		String[] names = file.list();

		for(String name : names)
		{
		    if (new File(nomeDiretorio + name).isDirectory())
		    {
		        System.out.println(nomeDiretorio + name);
		    }		    
		}
		
		*/
		
		/*
		String[] directories = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File current, String name) {
				return new File(current, name).isDirectory();
			}
		});
		System.out.println(Arrays.toString(directories));
		*/
		
		
		
		
		
		
		

		
		
		
		
		
		
	}
}
