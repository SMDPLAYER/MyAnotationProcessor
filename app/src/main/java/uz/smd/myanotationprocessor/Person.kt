package uz.smd.myanotationprocessor


import uz.smd.autoadapter_annotations.AdapterModel
import uz.smd.autoadapter_annotations.ViewHolderBinding

@AdapterModel(R.layout.layout_person)
data class Person(
    @ViewHolderBinding(R.id.name) val Name: String,
    @ViewHolderBinding(R.id.address) val Address: String
)
