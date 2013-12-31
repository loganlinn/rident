(ns rident.adj-noun
  (:require [rident.core :as core]))

(defrecord AdjectiveNounGenerator [adjectives nouns prefix suffix sep]
  core/Generator
  (generate [_]
    (str
      (when prefix (str (prefix) sep))
      (rand-nth adjectives)
      sep
      (rand-nth nouns)
      (when suffix (str sep (suffix))))))

(def generator
  (map->AdjectiveNounGenerator
    {:adjectives ["afternoon" "aged" "ancient" "autumn" "billowing" "bitter"
                  "black" "blue" "bold" "broken" "calm" "caring" "cold" "cool"
                  "crimson" "damp" "dark" "dawn" "delicate" "divine" "dry"
                  "empty" "ephemeral" "evening" "falling" "fathomless" "floral"
                  "fragrant" "frosty" "golden" "green" "hidden" "holy" "icy"
                  "imperfect" "impermanent" "late" "lingering" "little" "lively"
                  "long" "majestic" "mindful" "misty" "morning" "muddy"
                  "nameless" "noble" "old" "patient" "polished" "proud" "purple"
                  "quiet" "red" "restless" "rough" "shy" "silent" "silvery"
                  "slender" "small" "smooth" "snowy" "solitary" "sparkling"
                  "spring" "stately" "still" "strong" "summer" "timeless"
                  "twilight" "unknowable" "unmovable" "upright" "wandering"
                  "weathered" "white" "wild" "winter" "wispy" "withered"
                  "young"]
     :nouns ["bird" "breeze" "brook" "brook" "bush" "butterfly" "chamber"
             "chasm" "cherry" "cliff" "cloud" "darkness" "dawn" "dew" "dream"
             "dust" "eye" "feather" "field" "fire" "firefly" "flower" "foam"
             "fog" "forest" "frog" "frost" "glade" "glitter" "grass" "hand"
             "haze" "hill" "horizon" "lake" "leaf" "lily" "meadow" "mist"
             "moon" "morning" "mountain" "night" "paper" "pebble" "pine"
             "planet" "plateau" "pond" "rain" "resonance" "ridge" "ring" "river"
             "sea" "shadow" "shape" "silence" "sky" "smoke" "snow" "snowflake"
             "sound" "star" "stream" "sun" "sun" "sunset" "surf" "thunder"
             "tome" "tree" "violet" "voice" "water" "waterfall" "wave" "wave"
             "wildflower" "wind" "wood"]
     :suffix (fn [] (apply str (repeatedly 4 #(rand-int 10))))
     :sep "-"}))

(defn generate [] (core/generate generator))
