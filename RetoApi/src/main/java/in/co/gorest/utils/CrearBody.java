package in.co.gorest.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CrearBody {

	    private String plantillaRuta;

	    public CrearBody(String plantillaRuta){
	        this.plantillaRuta = plantillaRuta;
	    }

	    public static CrearBody conLaPlantilla(String plantilla){
	        return new CrearBody(plantilla);
	    }
	    
	    public String yElCorreo(String correo){
	        String nuevaPlantilla = parseJson(plantillaRuta);
	        nuevaPlantilla = nuevaPlantilla.replace("${correo}", correo);
	        return nuevaPlantilla;
	    }


	    public String parseJson(String ruta){
	        String resultStr="";
	        try {
	            resultStr=readFileAsString(ruta);
	        } catch (Exception e) {
	        }
	            return resultStr;
	    }

	    public static String readFileAsString(String fileName)
	    {
	        String data = "";
	        try {
				data = new String(Files.readAllBytes(Paths.get(fileName)));
			} catch (IOException e) {
		         }
	        return data;
	    }
	    
}


