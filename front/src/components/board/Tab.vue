<script setup>
import {defineProps, reactive, ref} from 'vue';

const props = defineProps({
  index: {
    required: true,
    type: Number
  },
  selected: {
    required: true,
    type: Boolean
  }
})

const emits = defineEmits(['clickTab']);

const rainbowColor = ['red', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet']
const selectedTabStyle = reactive({
  'border-bottom': `2px solid ${rainbowColor[props.index % 7]}`
})
</script>

<template>
  <div
    class="tab"
    :style="[selected ? selectedTabStyle: null]"
    @click="emits('clickTab', index)"
  >
    <slot></slot>
  </div>
</template>

<style lang="scss" scoped>
.tab {
  padding: 2px 10px 0 10px;
  margin-bottom: -1px;
  cursor: pointer;
  user-select: none;
  font-size: 13px;
}
</style>