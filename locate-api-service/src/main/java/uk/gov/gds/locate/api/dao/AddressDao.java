package uk.gov.gds.locate.api.dao;


import com.yammer.metrics.annotation.Timed;
import org.mongojack.DBCursor;
import org.mongojack.JacksonDBCollection;
import uk.gov.gds.locate.api.model.Address;

import java.util.List;

public class AddressDao {

    private final JacksonDBCollection<Address, String> addresses;

    public AddressDao(JacksonDBCollection<Address, String> addresses) {
        this.addresses = addresses;
    }

    @Timed
    public List<Address> findAllForPostcode(String postcode) {
        return addresses.find().is("postcode", postcode).toArray();
    }

    @Timed
    public List<Address> findAllForUPRN(String uprn) {
        return addresses.find().is("uprn", uprn).toArray();
    }

    @Timed
    public List<Address> findAllForUSRN(String usrn) {
        return addresses.find().is("detail.usrn", usrn).toArray();
    }
}
