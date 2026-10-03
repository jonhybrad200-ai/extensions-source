package eu.kanade.tachiyomi.extension.fr.mangasorigines

import eu.kanade.tachiyomi.multisrc.madara.Madara
import java.text.SimpleDateFormat
import java.util.Locale

class MangasOrigines : Madara(
    "Mangas-Origines.fr",
    "https://mangas-origines.fr",
    "fr",
    dateFormat = SimpleDateFormat("d MMM yyyy", Locale.FRENCH),
) {
    override val mangaSubString = "oeuvre"

    override val supportsLatest = true
}
