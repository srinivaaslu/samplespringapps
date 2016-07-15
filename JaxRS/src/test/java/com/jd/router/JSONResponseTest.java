package com.jd.router;


import com.jd.model.Track;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by 205025 on 6/8/2016.
 */
public class JSONResponseTest {

    @Test
    public void testGetJSONResponse(){
        JSONResponseResouce jsonResponseResouce = new JSONResponseResouce();
        Track track = jsonResponseResouce.getTrackInJSON();
        assertNotNull(track);

    }


}
