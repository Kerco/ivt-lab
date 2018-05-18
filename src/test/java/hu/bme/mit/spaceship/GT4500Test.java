package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;
  private TorpedoStore mockStore;
  private TorpedoStore mockStoreSecondary;

  @Before
  public void init(){
    mockStore = mock(TorpedoStore.class);
    mockStoreSecondary = mock(TorpedoStore.class);

    this.ship = new GT4500(mockStore,mockStoreSecondary);
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange
    when (mockStore.fire(1)).thenReturn(true);
    when (mockStore.isEmpty().thenReturn(false);

    when (mockStoreSecondary.fire()).thenReturn(true);
    when (mockStore.isEmpty().thenReturn(false)

  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedo(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
