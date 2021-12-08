package fr.pantheonsorbonne.miage;

/**
 * an object able to be serialized as a File
 * 
 * @author nherbaut
 *
 */
public abstract class FileGenerator<G extends DiplomaGenerator> {

	protected final G generator;

	 FileGenerator(G t) {
		this.generator = t;
	}

	public abstract void generateFile(String outputFile);
}
