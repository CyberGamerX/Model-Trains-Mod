package me.kk47.modeltrains.items.trains;

import net.minecraft.util.ResourceLocation;
import me.kk47.modeltrains.Data;
import me.kk47.modeltrains.client.model.ModelDummyTrain;

public class ItemDummyTrain extends ItemTrain {

	public ItemDummyTrain() {
		super(EnumTrainType.CARRAGE_FREIGHT, "dummyTrain", 0);
		this.setModel(new ModelDummyTrain());
		this.setTexture(new ResourceLocation(Data.MODID + ":/textures/trains/DummyTrain.png"));
	}

}