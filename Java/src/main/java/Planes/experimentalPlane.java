package Planes;

import models.ClassificationLevel;
import models.ExperimentalPlaneTypes;

public class ExperimentalPlane extends Plane{

    private ExperimentalPlaneTypes experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String modelName, int planeMaxSpeed, int planeMaxFlightDistance, int planeMaxLoadCapacity, ExperimentalPlaneTypes experimentalType, ClassificationLevel classificationLevel) {
        super(modelName, planeMaxSpeed, planeMaxFlightDistance, planeMaxLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object comparedPlane) {
        return super.equals(comparedPlane);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + modelName + '\'' +
                '}';
    }
}
