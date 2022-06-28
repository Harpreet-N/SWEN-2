package at.technikum.tour_planner.viewModels;

import at.technikum.tour_planner.dal.DAL;
import at.technikum.tour_planner.model.TourFx;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.image.Image;

import java.util.Arrays;

public class TourDetailViewModel {

    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty from = new SimpleStringProperty();
    private final StringProperty to = new SimpleStringProperty();
    private final StringProperty transport = new SimpleStringProperty();
    private final StringProperty distance = new SimpleStringProperty();
    private final StringProperty duration = new SimpleStringProperty();
    private final StringProperty description = new SimpleStringProperty();

    private ObjectProperty<Image> mapURL = new SimpleObjectProperty<>();

    private volatile boolean isInitValue = false;
    private TourFx tourFx;


    public TourDetailViewModel() {
       // this.mapTourService = mapTourService;
        name.addListener((arg, oldVal, newVal) -> updateTourModel());
        from.addListener((arg, oldVal, newVal) -> updateTourModel());
        to.addListener((arg, oldVal, newVal) -> updateTourModel());
        transport.addListener((arg, oldVal, newVal) -> updateTourModel());
        distance.addListener((arg, oldVal, newVal) -> updateTourModel());
        duration.addListener((arg, oldVal, newVal) -> updateTourModel());
        description.addListener((arg, oldVal, newVal) -> updateTourModel());
        mapURL.addListener((arg, oldVal, newVal) -> updateTourModel());
    }

    public void setTourModel(TourFx tourFx) {
        isInitValue = true;
        if (tourFx == null) {
            name.set("");
            from.set("");
            to.set("");
            return;
        }
        this.tourFx = tourFx;
        name.setValue(tourFx.getName());
        from.setValue(tourFx.getFromDestination());
        to.setValue(tourFx.getToDestination());
        transport.setValue(tourFx.getTransport());
        distance.setValue(String.valueOf(tourFx.getDistance()));
        duration.setValue(String.valueOf(tourFx.getEstimatedTime()));
        description.setValue(tourFx.getDescription());
        var src = "file:target/res/images/mapImage" + String.valueOf(tourFx.getId()) + ".jpg";
        Image image = new Image(src);
        mapURL.setValue(image);
        isInitValue = false;
    }


    public void updateTourModel() {
        if (!isInitValue)
            DAL.getInstance().tourDao().update(tourFx, Arrays.asList(tourFx.getId(), name.get(), description.get(), from.get(), to.get(), transport.get(), distance.get(), duration.get(), mapURL));
    }

    public void refreshTour() {
        if (!isInitValue)
            DAL.getInstance().tourDao().getAll();
    }


    public StringProperty nameProperty() {
        return name;
    }
    public StringProperty fromProperty() {
        return from;
    }
    public StringProperty toProperty() {
        return to;
    }
    public StringProperty transportProperty() {
        return transport;
    }
    public StringProperty distanceProperty() {
        return distance;
    }
    public StringProperty durationProperty() {
        return duration;
    }
    public StringProperty descriptionProperty() {
        return description;
    }

    public ObjectProperty<Image> mapURLProperty() {
        return mapURL;
    }


    public TourFx getTourFx() {
        return tourFx;
    }

}
