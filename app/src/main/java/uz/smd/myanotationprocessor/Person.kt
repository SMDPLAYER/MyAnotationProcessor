package uz.smd.myanotationprocessor


import uz.smd.autoadapter_annotations.AdapterModel
import uz.smd.autoadapter_annotations.ViewHolderBinding

@AdapterModel(R.layout.layout_person)
data class Person(
    @ViewHolderBinding(R.id.name) val name: String,
    @ViewHolderBinding(R.id.address) val address: String
){
    @JvmName("getName1")
    fun getName():String{
        return name
    }

    @JvmName("getAddress1")
    fun getAddress():String{
        return address
    }
}
