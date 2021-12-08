package fr.pantheonsorbonne.miage;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import com.itextpdf.text.DocumentException;

/**
 * a Diploma generator for the MIAGE section
 * 
 * @author nherbaut
 *
 */
public interface DiplomaGenerator {

	/**
	 * Generate the diploma in a Stream
	 * 
	 * @return
	 * @throws IOException 
	 * @throws DocumentException 
	 * @throws MalformedURLException 
	 */
	InputStream getContent() throws MalformedURLException, DocumentException, IOException;

}
