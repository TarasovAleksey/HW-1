package hw_1;

public class MinMaxValues {

	  public static void main(String[] args) {
		    		       String[] validTypes = {"byte", "short", "int", "long", "char", "float", "double"};
		        
		       		 if (args.length == 0) {
		            printAllTypes();
		            return;
		        }
                    for (String arg : args) {
		            boolean validType = false;
		            switch (arg) {
		                case "byte":
		                    printTypeInfo("byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
		                    validType = true;
		                    break;
		                case "short":
		                    printTypeInfo("short", Short.MIN_VALUE, Short.MAX_VALUE);
		                    validType = true;
		                    break;
		                case "int":
		                    printTypeInfo("int", Integer.MIN_VALUE, Integer.MAX_VALUE);
		                    validType = true;
		                    break;
		                case "long":
		                    printTypeInfo("long", Long.MIN_VALUE, Long.MAX_VALUE);
		                    validType = true;
		                    break;
		                case "char":
		                    printTypeInfo("char", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		                    validType = true;
		                    break;
		                case "float":
		                    printTypeInfo("float", Float.MIN_VALUE, Float.MAX_VALUE);
		                    validType = true;
		                    break;
		                case "double":
		                    printTypeInfo("double", Double.MIN_VALUE, Double.MAX_VALUE);
		                    validType = true;
		                    break;
		                default:
		                    System.out.println(arg + "");
		                    break;
		            }

		        if (validType) {
		                System.out.println(arg + "");
		            }
		        }

		        if (args.length > 0 && !anyValidType(args)) {
		            printAllTypes();
		        }
		    }

		   		    private static void printTypeInfo(String typeName, Number minValue, Number maxValue) {
		        System.out.println(typeName + " - Min: " + minValue + ", Max: " + maxValue);
		    }

		     private static void printTypeInfo(String typeName, int minValue, int maxValue) {
		        System.out.println(typeName + " - Min: " + minValue + ", Max: " + maxValue);
		    }

		    private static void printAllTypes() {
		        System.out.println("byte - Min: " + Byte.MIN_VALUE + ", Max: " + Byte.MAX_VALUE);
		        System.out.println("short - Min: " + Short.MIN_VALUE + ", Max: " + Short.MAX_VALUE);
		        System.out.println("int - Min: " + Integer.MIN_VALUE + ", Max: " + Integer.MAX_VALUE);
		        System.out.println("long - Min: " + Long.MIN_VALUE + ", Max: " + Long.MAX_VALUE);
		        System.out.println("char - Min: " + (int) Character.MIN_VALUE + ", Max: " + (int) Character.MAX_VALUE);
		        System.out.println("float - Min: " + Float.MIN_VALUE + ", Max: " + Float.MAX_VALUE);
		        System.out.println("double - Min: " + Double.MIN_VALUE + ", Max: " + Double.MAX_VALUE);
		    }

		   		private static boolean anyValidType(String[] args) {
		        for (String arg : args) {
		            switch (arg) {
		                case "byte":
		                case "short":
		                case "int":
		                case "long":
		                case "char":
		                case "float":
		                case "double":
		                    return true;
		            }
		        }
		        return false;
		    }
		
	  }


