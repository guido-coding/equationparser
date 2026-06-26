package equationparser;

@FunctionalInterface
public interface Operation {
	public double performOperation(double[] values);
}
